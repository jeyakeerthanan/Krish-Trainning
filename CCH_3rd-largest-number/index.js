var array=[];
var result=[];
 array =[12,14,11,13,15,12,19,34,23,18];
 

function findThirdMax (array){

    //sorting
   var index = array.length-1;
   var temp;
      var j;
    for (var i=0; i< index; i++){

        j = i;

        for(var k=0; k< index-j; k++){

            if (array[k] > array[k+1]){

                //swapping
                temp= array[k];
                array[k]=array[k+1];
                array[k+1]=temp;

            }
        }

    }
    
        //delete duplicate values
        var unique_array = [...new Set(array)];
        console.log("Series : " + array);
        console.log("************************************************** ");
        console.log("Third largest number is " + unique_array[unique_array.length-3]);
   }
   
   findThirdMax(array);
