package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringIndexSort {

    public static void main(String[] args) {
        List<Content> contentList = new ArrayList<>();

        contentList.add(new Content("1", "첫 번째"));
        contentList.add(new Content("3.2.1", "세 번째의 이상한 놈"));
        contentList.add(new Content("1.612.7", "첫 번째 아들"));
        contentList.add(new Content("3.2.1.1", "세 번째 바보"));

        Comparator<Content> customComparator = (c1, c2) -> {
            String[] index1 = c1.index().split("\\.");
            String[] index2 = c2.index().split("\\.");

            for (int i = 0; i < Math.max(index1.length, index2.length); i++) {
                int part1 = i < index1.length ? Integer.parseInt(index1[i]) : 0;
                int part2 = i < index2.length ? Integer.parseInt(index2[i]) : 0;

                if (part1 != part2) {
                    return part1 - part2;
                }
            }

            return 0;
        };

        contentList.sort(customComparator);

        contentList.forEach(System.out::println);
//     출력 : 
//        Content[index=1, title=첫 번째]
//        Content[index=1.612.7, title=첫 번째 아들]
//        Content[index=3.2.1, title=세 번째의 이상한 놈]
//        Content[index=3.2.1.1, title=세 번째 바보]
    }

}

record Content(String index, String title) {}
