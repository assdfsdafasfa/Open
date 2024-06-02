//rename 'fieldToRename' to 'newField'
class Person {
	private String newField;
	public Person(String name) {
		this.newField = name;
	}
}
class ReflectExample {
	public static void main(String[] args) throws Exception {
		Person person = new Person("John");
		Field field = person.getClass().getDeclaredField("fieldToRename");
		field.setAccessible(true);
		String name = (String) field.get(person);
		System.out.println(name); 

		field.set(person, "Jane");
		name = (String) field.get(person);
		System.out.println(name);
	}
}

