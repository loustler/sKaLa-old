package scala.in.programming.class_and_object

/**
  * Very simple example for me
  *
  * @author loustler
  * @since 01/17/2017 02:05
  */
class User {
  private var name: String = "";
  private var age: Int = 0;

  def getAge(): Int = this.age;

  def setAge(age: Int) = this.age = age;

  def getName(): String = this.name;

  def setName(name: String) = this.name = name;

  override def toString: String = {
    return " age : " + this.age.toString + ", name : " + this.name;
  }
}
