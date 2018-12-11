public class DogInfo extends Dog
{
   String skill;

   public DogInfo(){}

   public DogInfo(String name, int age, String skill)
   {
     this.name = name;
     this.age = age;
     this.skill = skill;
   }

   public String getSkill()
   {
     return name+" can "+skill;
   }

   public void setSkill(String skill)
   {
     this.skill = skill;
   }

   public String displayInfo()
   {
     return "The name of this good boi is "+this.name+". He is "+this.breed+" and he can "+this.skill;
   }
}
