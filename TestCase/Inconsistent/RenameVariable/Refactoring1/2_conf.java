interface B{
	int newField= 0;
}
class A implements B{
          int m(){
  // rename fieldToRename to newField
	int fieldToRename=0;
	fieldToRename = newField;
	return 0;
       };
}
