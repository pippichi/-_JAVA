class TestDog{
 public static void main(String[] args){
  Dog d1=new Dog(80,"xiaozuo","xiaoshi");
  Dog d2=new Dog(18,"zuoxiao","shixiao");
  Owner xiaoYing=new Owner("xiaoYing","yangGou");
/*  MyDog.setSize(85);
  MyDog.setName("wangcai");
  MyDog.setBread("dubin");
  System.out.println(MyDog.getName()+" "+MyDog.getSize()+" "+MyDog.getBread());
  MyDog.bark();*/
  xiaoYing.hello(d1);
  Dog[] myDogs=new Dog[7];
  myDogs[0]=new Dog(12,"ɳƤ","ƤƤ");
  myDogs[1]=new Dog(25,"����","С��");
  myDogs[2]=new Dog(28,"�ڱ�","С��");
  myDogs[3]=new Dog(35,"�ű�","С��");
  myDogs[4]=new Dog(37,"����","С��");
  myDogs[5]=new Dog(48,"����","С��");
  myDogs[6]=new Dog(50,"ѩ��Ȯ","Сѩ");
  Owner xiaoZhang=new Owner("������","����");
  xiaoZhang.feedDog(myDogs);
 }
}
