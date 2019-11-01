function loadFox(fox){
    document.getElementById("name").innerHTML = fox.name;
}

function getFox(){
    let foxID= document.getElementById("foxnum").value;
    console.log("in get fox");
    //step 1
    var xhr= new XMLHttpRequest();
    //step 2
    xhr.onreadystatechange= function(){
        console.log(" in ORSC");
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.responseText);
            var fox= JSON.parse(xhr.responseText);
            loadFox(fox);
        }
    }
    //step 3
    xhr.open("GET","http://www.recipepuppy.com/api/?q=" +foxID, true);
    //step 4
    xhr.send();
}

window.onload= function(){
    console.log("in onload");
    document.getElementById("foxsubmit").addEventListener("click", getFox, false);
}