let arrProduct = ["prd1"]

function getData(){
    let newProduct = document.getElementById("productInput").value
    arrProduct.push(newProduct)
    displayAllPrd()
}

function displayAllPrd() {
    let data = ""
    data+= "<table>"
    data+= "<tr>"
    data+= "<td>Product Name</td>"
    data += "<td>" +  arrProduct.length +"products</td>"
    data+= "</tr>"
    for (let i = 0; i<arrProduct.length; i++) {
        data += "<tr>"
        data += "<td>"+arrProduct[i] +"</td>"
        data += "<td><button>Edit</button></td>"
        data += "<td><button>Delete</button></td>"
        data += "</tr>"
    }
    data+= "</table>"
    document.getElementById("display").innerHTML = data
}

displayAllPrd()
