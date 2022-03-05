function getArrayA<T>(items: T[]): T[] { 
    return new Array<T>().concat(items);
}
let array1 = getArrayA<number>([3, 4, 2, 4, 5, 6, 3, 5, 3, 4]);
let array2 = getArrayA<string>(['One', 'Two', 'Three', 'Four']);
array1.push(4444);
array2.push("Five");
console.log(array1);
console.log(array2);
console.log(array1[0]);
console.log(array2[1]);
console.log(typeof(array1[0]));
console.log(typeof(array2[1]));
console.log(typeof(array1));
console.log(typeof(array2));
