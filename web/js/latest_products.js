/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
console.log("inside latest_product.js");

var prod_latest_requests = new Array();

var prod_latest_area = document.getElementById("prod_latest_area");

var prod_latest_count = 4;

function init_latest_prods()
{
	if(prod_latest_area != null)
		while(prod_latest_area.hasChildNodes())
			prod_latest_area.removeChild(prod_latest_area.lastChild);
	for(var i = 0; i < prod_latest_count; i++)
	{
		init_latest_request(i);
		prod_latest_requests[i].open("GET", "prod-serv?page=index.jsp&category=latest&index=" + i, true);
		prod_latest_requests[i].send(null);
	}
	
}

function init_latest_request(index)
{
	if(window.XMLHttpRequest)
		prod_latest_requests[index] = new XMLHttpRequest();
	else if(window.ActiveXObject)
		prod_latest_requests[index] = new ActiveXObject("Microsoft.XMLHTTP");
	prod_latest_requests[index].onreadystatechange = disp_latest_prod;
}

function disp_latest_prod()
{
	for(var i = 0; i < prod_latest_requests.length; i++)
	{
		var request = prod_latest_requests[i];
		if(request != null && request.readyState == 4 && request.status == 200)
		{
			var prod = JSON.parse(request.responseText);
			console.log(prod.index);
			if(prod.index != -1)
			{
				/**
					<div class="single-product" name="prod-latest-div">
						<div class="product-f-image">
							<img src="img/product-1.jpg" alt="" id="prod-latest-img-0">
							<div class="product-hover">
								<a href="#" class="add-to-cart-link" id="prod-latest-add-0"><i class="fa fa-shopping-cart"></i> Add to cart</a>
								<a href="single-product.html" class="view-details-link" id="prod-latest-detail-0"><i class="fa fa-link"></i> See details</a>
							</div>
						</div>

						<h2 id="prod-latest-name-0"><a href="single-product.html" id="prod-latest-single-0">Samsung Galaxy s5- 2015</a></h2>

						<div class="product-carousel-price">
							<ins id="prod-latest-price-0">$700.00</ins> <del>$100.00</del>
						</div> 
                    </div>
				*/ 
				var prodDiv = document.createElement('div');
				prodDiv.className = 'single-product';
				
				var prod_img = document.createElement('div');
				prod_img.className = 'product-f-image';
				
				var prod_img_img = document.createElement('img');
				//prod_img_img.src = "prod-img-serv?id=" + prod.product.productId;
				
				var prod_img_hoover = document.createElement('div');
				prod_img_hoover.className = 'product-hover';
				
				var prod_img_add = document.createElement('a');
				prod_img_add.className = 'add-to-cart-link';
				//prod_img_add.href;
				prod_img_add.text = "Add to cart";
				
				var prod_img_add_i = document.createElement('i');
				prod_img_add_i.className = "fa fa-shopping-cart";
				
				prod_img_add.appendChild(prod_img_add_i);
				
				var prod_img_details = document.createElement('a');
				prod_img_details.className = 'view-details-link';
				prod_img_details.href = "single-product.jsp?id=" + prod.product.productId;
				prod_img_details.text = "See details";
				
				var prod_img_details_i = document.createElement('i');
				prod_img_details_i.className = "fa fa-link";
				
				prod_img_details.appendChild(prod_img_details_i);
				
				prod_img_hoover.appendChild(prod_img_add);
				prod_img_hoover.appendChild(prod_img_details);
				
				prod_img.appendChild(prod_img_img);
				prod_img.appendChild(prod_img_hoover);
				
				var prod_name = document.createElement('h2');
				
				var prod_name_link = document.createElement('a');
				prod_name_link.href = "single-product.jsp?id=" + prod.product.productId;
				
				prod_name.appendChild(prod_name_link);
				
				var prod_price = document.createElement('div');
				prod_price.className = "product-carousel-price";
				
				var prod_price_ins = document.createElement('ins');
				
				prod_price.appendChild(prod_price_ins);
				
				prodDiv.appendChild(prod_img);
				prodDiv.appendChild(prod_name);
				prodDiv.appendChild(prod_price);
				
				prod_latest_area.appendChild(prodDiv);
				/*document.getElementById("prod-latest-img-" + prod.index).src = "prod-img-serv?id=" + prod.product.productId;
				console.log(document.getElementById("prod-latest-img-" + prod.index).src);
				
				//document.getElementById("prod-latest-add-" + prod.index).href;
				console.log(document.getElementById("prod-latest-add-" + prod.index).href);
				
				document.getElementById("prod-latest-detail-" + prod.index).href = "single-product.jsp?id=" + prod.product.productId;
				
				document.getElementById("prod-latest-single-" + prod.index).text = prod.product.name;
				console.log(document.getElementById("prod-latest-single-" + prod.index).text);
				
				document.getElementById("prod-latest-single-" + prod.index).href = "single-product.jsp?id=" + prod.product.productId;
				
				document.getElementById("prod-latest-price-" + prod.index).text = prod.product.price;
				console.log(document.getElementById("prod-latest-price-" + prod.index).innerHTML);*/
			}
			
			prod_latest_requests[i] = null;
		}
	}
}