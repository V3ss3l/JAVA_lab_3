package exercise_4;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public static Shirt[] convertToEntity(String[] src){
        Shirt[] result = new Shirt[src.length];
        for (int i = 0; i < src.length; i++) {
            String s = src[i];
            String[] description = s.split(",");
            Shirt buff = new Shirt(description[0], description[1],
                    description[2], description[3]);
            result[i] = buff;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
