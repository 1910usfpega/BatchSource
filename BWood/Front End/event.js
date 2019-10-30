function bubble (event){
    let element=event.currentTarget
    element.style.backgroundColor="green";
    alert(element.id);
}

window.onload=function(){
    document.getElementById("A").addEventListener("click",this.bubble,!false);
    document.getElementById("B").addEventListener("click",this.bubble,!false);
    document.getElementById("C").addEventListener("click",this.bubble,!false);
    document.getElementById("D").addEventListener("click",this.bubble,!false);
}