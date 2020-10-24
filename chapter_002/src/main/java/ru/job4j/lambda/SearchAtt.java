package ru.job4j.lambda;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.function.Function;

public class SearchAtt {
    private static List<Attachment> filter(List<Attachment> list, Function<List<Attachment>, List<Attachment>> func) {
        return func.apply(list);
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Function<List<Attachment>, List<Attachment>> function = new Function<List<Attachment>, List<Attachment>>() {
            @Override
            public List<Attachment> apply(List<Attachment> list) {
                List<Attachment> rsl = new ArrayList<>();
                for (Attachment att : list) {
                    if (att.getSize() > 100) {
                        rsl.add(att);
                    }
                }
                return rsl;
            }
        };
        return filter(list, function);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Function<List<Attachment>, List<Attachment>> function = new Function<List<Attachment>, List<Attachment>>() {
            @Override
            public List<Attachment> apply(List<Attachment> list) {
                List<Attachment> rsl = new ArrayList<>();
                for (Attachment att : list) {
                    if (att.getName().contains("bug")) {
                        rsl.add(att);
                    }
                }
                return rsl;
            }
        };
        return filter(list, function);
    }
}


