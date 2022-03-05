function getArray(item :any[]): any [] {
 return new Array().concat(item);	 
}
let arrya1=getArray([1,2,3,5,4,6,9,8,9]);
let array3=getArray(['Abhiujt','Amit','Umesh','Shubham']);
arrya1.push(12365);
array3.push('Ajauy');
console.log(arrya1);
console.log(array3);

