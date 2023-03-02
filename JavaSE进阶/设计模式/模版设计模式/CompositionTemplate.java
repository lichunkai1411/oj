package 设计模式.模版设计模式;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-14
 * Time：09:33
 * @author lck
 */
public abstract class CompositionTemplate {
    // 不希望被子类重写的方法加final关键字修饰
    public final void write(){
        System.out.println("我的爸爸");
//        System.out.println("那是一个秋天，风那么缠绵，记忆中爸爸骑车接我放学回家，我的脚卡在了车条中，爸爸蹬不动，他就站起来蹬...QAQ");
        body();
        System.out.println("啊~ 这就是我的爸爸~");
    }
    public abstract void body();

}
