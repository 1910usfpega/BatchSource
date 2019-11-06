function loadMusic(music){
    document.getElementById("name").innerHTML=music.name;
}

function getMusic(){
    let musicID= document.getElementById("msID").value;
    console.log("in get music");
    //Step 1
    var xhr= new XMLHttpRequest();
    //Step 2
    xhr.onreadystatechange= function(){
        console.log(" in ORSC");
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.reponseText);
            var music= JSON.parse(xhr.responseText);
            loadMusic(music);
        }
    }
    //Step 3
    xhr.open("GET","https://api.spotify.com/v1/artists/{id}/albums"+musicID, true);
    //Step 4
    xhr.send();
}
window.onload= function(){
    console.log("in onload");
    document.getElementById("musicsubmit").addEventListener("click", getMusic, false);
}