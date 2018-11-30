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
  myDogs[0]=new Dog(12,"沙皮","皮皮");
  myDogs[1]=new Dog(25,"比特","小特");
  myDogs[2]=new Dog(28,"黑背","小黑");
  myDogs[3]=new Dog(35,"杜宾","小杜");
  myDogs[4]=new Dog(37,"藏獒","小藏");
  myDogs[5]=new Dog(48,"土佐","小左");
  myDogs[6]=new Dog(50,"雪橇犬","小雪");
  Owner xiaoZhang=new Owner("张三丰","养狗");
  xiaoZhang.feedDog(myDogs);
 }
}
