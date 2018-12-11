public abstract class Dog
{
   String name;
   String breed;
   int age;

   public Dog() {}

   public Dog(String name, int age)
   {
     this.name = name;
     this.age = age;
   }

   public Dog(String name, String breed, int age)
   {
     this.name = name;
     this.breed = breed;
     this.age = age;
   }

   public String getName()
   {
     return name;
   }

   public int getAge()
   {
     return age;
   }

   public String getBreed()
   {
     return breed;
   }

   public void setBreed(String breed)
   {
     this.breed = breed;
   }

   public void setName(String name)
   {
     this.name = name;
   }

   public void setAge(int age)
   {
     this.age = age;
   }

   abstract String displayInfo();


}
