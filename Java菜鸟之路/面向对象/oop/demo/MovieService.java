package 面向对象.oop.demo;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-31
 * Time：10:59
 *
 * @author lck
 */
public class MovieService {
    private Movie[] movies;
    private Scanner scanner = new Scanner(System.in);

    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    /**
     * 启动电影信息管理系统
     */
    public void start() {

        lo:
        while (true) {
            System.out.println("----------电影信息系统----------");
            System.out.println("请输入您的选择：");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    queryMovieInfos();
                    break;
                case 2:
                    queryMovieInfoById();
                    break;
                case 3:
                    System.out.println("感谢您的使用，再见！");
                    break lo;
                default:
                    System.out.println("您的输入有误，请检查");
                    break;
            }
        }
    }

    /**
     * 此方法根据电影编号，查询电影详情信息
     */
    private void queryMovieInfoById() {
        // 1.键盘录入用户输入的编号
        System.out.println("请输入您要查询的电影编号：");
        int id = scanner.nextInt();
        // 2.遍历数组，从数组中查询电影信息
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            if (movie.getId()==id){
                // 3.将找到的电影信息，打印在控制台
                System.out.println(movie.getId()+"---"+movie.getTitle()+"---"+movie.getTime()
                        +"---"+movie.getScore()+"---"+movie.getArea()+"---"+movie.getType()
                        +"---"+movie.getDirector()+"---"+movie.getStarring());
                return;
            }
        }
        System.out.println("您输入的编号不存在，请检查！");
    }

    /**
     * 此方法展示系统中全部电影(名称，评分)
     */
    private void queryMovieInfos() {
        // 1.遍历数组，取出每一个电影对象
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            // System.out.println(movie);  打印对象名，会看到内存地址
            // 2.通过电影对象，调用内部getXxx方法，获取信息并打印
            System.out.println(movie.getTitle()+"---"+movie.getScore());
        }
    }
}
