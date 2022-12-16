const elem = document.getElementById("elem");

async function grabDate(){
try{
const response = await fetch('http://localhost:8080/api/tourista');
const responseJSO = await response.json();
for(tourist of responseJSO){
elem.innerHTML += 'The first Tourist name is' ${myObj.name} ' and Place is ' ${myObj.place}.<br>
}
} catch(e){
console.log("error:"+ e.message);
}
}
grabData();