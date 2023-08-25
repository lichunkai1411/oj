package test;

// 文本接口
interface Text {
    String getContent();
}

// 基本文本类
class SimpleText implements Text {
    private String content;

    public SimpleText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

// 装饰器抽象类
abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }
}

// 删除文本装饰器
class DeleteTextDecorator extends TextDecorator {
    public DeleteTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<del>" + decoratedText.getContent() + "</del>";
    }
}

public class Main {
    public static void main(String[] args) {
        Text simpleText = new SimpleText("Hello, world!");
        Text deletedText = new DeleteTextDecorator(simpleText);

        System.out.println("Simple Text: " + simpleText.getContent());
        System.out.println("Deleted Text: " + deletedText.getContent());

    }
}

