function loadPokemon(pokemon){
    document.getElementById("name").innerHTML = pokemon.name;
}

function getPokemon(){
    let pokemonID= document.getElementById("pkID").value;
    console.log("in get pokemon");
    //step 1
    var xhr= new XMLHttpRequest();
    //step 2
    xhr.onreadystatechange= function(){
        console.log(" in ORSC");
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.responseText);
            var pokemon= JSON.parse(xhr.responseText);
            loadPokemon(pokemon);
        }
    }
    //step 3
    xhr.open("GET","https://pokeapi.co/api/v2/pokemon/" + pokemonID, true);
    //step 4
    xhr.send();
}

window.onload= function(){
    console.log("in onload");
    document.getElementById("pokesubmit").addEventListener("click", getPokemon, false);
}

