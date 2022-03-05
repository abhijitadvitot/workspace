function display<T,U>(id:T,name:U):void{
	console.log(typeof(id)+","+typeof(name)	);
	
}
display<number,string>(1,"Abhijt");
display<string,number>("Abhijt",1);
//======================================================

function displayType1<T>(id:T, name:any):void{
    console.log(typeof(id)+", "+typeof(name));
}
displayType1<boolean>(true,"Advitot");
displayType1<string[]>(["Abhijit ", "Advitot"],1);

//===========================================
function displayType2<T, U>(id:T, name:U):void{
    id.toString();
    name.toString();
    //id.toFixed();  // No gaurentee to be a number
    //name.toUpperCase(); // No gaurentee to be a string
    console.log(typeof(id)+", "+typeof(name));
}
displayType2<string, number>("AbhijitAdvitot",7);
displayType2<number,string>(2,"Advitot");
displayType2<boolean,string>(true,"Abhi");
displayType2<string[],number>(["Abhi	", "Advitot"],77);