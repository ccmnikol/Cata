
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }
    public void poop()
    {
        weight = weight - 70;
        System.out.println("Кошечка покакала");
    }
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Кошечка мяукнула");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        System.out.println("Кошечка поела");
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

//    public void getEatenFood()
//    {
//      return feed;
//    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Кошка умерла от голода";
        }
        else if(weight > maxWeight) {
            return "Кошка переела и взорвалась";
        }
        else if(weight > originWeight) {
            return "Кошка спит";
        }
        else {
            return "Кошка играет";
        }
    }
}