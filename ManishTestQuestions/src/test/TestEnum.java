package test;
String sound;
Animals(String s){
	sound=s;
}
class TestEnum {
	static Animal a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound+" "+a.FISH.sound);
	}

}
