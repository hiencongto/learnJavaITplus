let arrProduct = []

function formCreatNewProduct(){
    let data = ""
    data+="<label><b>Add New Product</b></label><br>"
    data+="<input type='text' id='newProduct' name='newProduct'>"
    data+="<button type='button' class='btn btn-success' onclick='creatNewProduct()'>Add</button>"
    document.getElementById("display").innerHTML = data;
}

function creatNewProduct(){
    let newProduct = document.getElementById("newProduct").value;
    arrProduct.push(newProduct)
    displayAllPrd()
}

function deleteProduct(index){
    arrProduct.splice(index,1)
    displayAllPrd()
}

function displayAllPrd() {
    let data = ""
    data+="<label><b>Add New Product</b></label>"
    data+="<button type='button' class='btn btn-success' onclick='formCreatNewProduct()'>Add</button>"
    data+="<p><b>Product Name</b></p>"
    data+="<table>"
    data+="<tr>"
    data+="<td>Product Name</td>"
    data+="<td>" +  arrProduct.length +"products</td>"
    data+="</tr style='height: 50px;'>"
    for (let i = 0; i<arrProduct.length; i++) {
        data += "<tr>"
        data += "<td>"+ i + "</td>"
        data += "<td onclick = 'formEditProductName("+i+")'>"+arrProduct[i]+"</td>"
        data += "<td><button onclick = 'deleteProduct("+i+")'>Delete</button></td>"
        data += "</tr>"
    }
    data+="</table>"
    document.getElementById("display").innerHTML = data;
}

function formEditProductName(index) {
    let data = ""
    data+="<label><b>Edit Product</b></label><br>"
    data+="<input type='text' id='newProductName' name='newProductName' value = '"+arrProduct[index]+"' placeholder = '"+arrProduct[index]+"'>"
    data+="<button type='button' class='btn btn-success' onclick='editProductName("+index+")'>Edit</button>"
    document.getElementById("display").innerHTML = data;
}

function editProductName(index) {
    let newProductName = document.getElementById("newProductName").value;
    arrProduct[index] = newProductName;
    displayAllPrd()
}

displayAllPrd()
