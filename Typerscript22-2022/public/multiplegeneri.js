function display(id, name) {
    console.log(typeof (id) + "," + typeof (name));
}
display(1, "Abhijt");
display("Abhijt", 1);
function displayType1(id, name) {
    console.log(typeof (id) + ", " + typeof (name));
}
displayType1(true, "Advitot");
displayType1(["Abhijit ", "Advitot"], 1);
function displayType2(id, name) {
    id.toString();
    name.toString();
    console.log(typeof (id) + ", " + typeof (name));
}
displayType2("AbhijitAdvitot", 7);
displayType2(2, "Advitot");
displayType2(true, "Abhi");
displayType2(["Abhi	", "Advitot"], 77);
//# sourceMappingURL=multiplegeneri.js.map