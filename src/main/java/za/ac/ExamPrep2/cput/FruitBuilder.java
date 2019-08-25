package za.ac.ExamPrep2.cput;

public class FruitBuilder
{
    String name, color;

   public FruitBuilder(){}

    public FruitBuilder(FruitBuilder fruitBuilder)
    {

    }

    FruitBuilder SetName(String name)
    {
        this.name = name;
        return this;
    }

    FruitBuilder SetColor(String color)
    {
        this.color = color;
        return this;
    }

    FruitBuilder build()
    {
        return new FruitBuilder(this);
    }

    @Override
    public String toString()
    {
        return "FruitBuilder{" + "name='" + name + '\'' + ", color='" + color + '\'' + '}';
    }
}
