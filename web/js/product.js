/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
console.log("inside product.js");

var products = document.getElementsByName("product-div");

for(var i = 0; i < products.length; i++)
{
	var prod_child = products[i].children;
	for(var j = 0; j < prod_child.length; j++)
		console.log(prod_child[j].nodeName);
}
