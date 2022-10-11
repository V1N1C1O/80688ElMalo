function agregar(){
    nodo=document.createElement("Li")
    //texto=document.createTexNode("hola")
    texto=document.createTextNode(document.getElementById("msj").value)
    nodo.appendChild(texto)
    nodo.setAtribute("id", "idx")
    document.getElementById("Lista").apeendChild(nodo)
} c