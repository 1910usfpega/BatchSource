function loadVG(vg){
    document.getElementById("vgID").innerHTML=vg.vgID;
    document.getElementById("vgName").innerHTML=vg.vgName;
    document.getElementById("vgMetaScore").innerHTML=vg.vgMetaScore;
}

function getVG(){
    console.log("inside getVg");
    let vgID=document.getElementById("vgIDInput").value;
    var xhr= new XMLHttpRequest();
    xhr.onreadystatechange= function(){
        console.log("inside ORSC " + xhr.readyState);
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.responseText);
            var vg=JSON.parse(xhr.responseText);
            loadVG(vg);
        }

    }
    xhr.open("GET","http://localhost:8080/JSONDemo/vg?vgid="+vgID,true);
    xhr.send();
}

function postVG(){
    console.log("in postVG");
    var xhr=new XMLHttpRequest();
    xhr.onreadystatechange= function(){
        console.log("inside ORSC " + xhr.readyState);
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.responseText);

    }
}
xhr.open("POST","http://localhost:8080/JSONDemo/vg", true);
var payload=jsonBuilder();
xhr.send(payload);
}