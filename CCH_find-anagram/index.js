const prompt = require("prompt-sync")({ sigint: true });
prompt("*********Find whether your two words are anagram or not*********** ");
const s1 = prompt("enter the first word ");
const s2 = prompt("enter the second  word ");



function Anagram (s1, s2){

 if(!s1 || !s2 || s1.length !== s2.length){return false;}

 var WS1 = s1.toLowerCase();
 var WS2 = s2.toLowerCase();

 if(WS1 === WS2) {return false;}

 var SS1 = WS1.split('').sort().join('');
 var SS2 = WS2.split('').sort().join('');

 return SS1 === SS2;
}



var result = Anagram(s1, s2);

console.log(result);