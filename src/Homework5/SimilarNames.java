package Homework5;

public class SimilarNames {
    private String similar_names;

    public String getSimilar_names() {
        return similar_names;
    }

    public SimilarNames(String similar_names) {
        this.similar_names = similar_names;
    }

    @Override
    public String toString() {
        return "SimilarNames{" +
                "similar_names='" + similar_names + '\'' +
                '}';
    }
}
