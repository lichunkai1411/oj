import java.util.Scanner;

public class Demo6 {
    // switch-case结构（2）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String citi = scanner.next();
        switch (citi){
            case "深圳":
                System.out.println("广东省");
                break;
            case "长沙":
                System.out.println("湖南省");
                break;
            case "武汉" :
                System.out.println("湖北省");
                break;
            case "长春":
                System.out.println("吉林省");
                break;
            case "沈阳":
                System.out.println("辽宁省");
                break;
            case "呼和浩特":
                System.out.println("内蒙古自治区");
                break;
            case "石家庄":
                System.out.println("河北省");
                break;
            case "乌鲁木齐":
                System.out.println("新疆维吾尔自治区");
                break;
            case "兰州":
                System.out.println("甘肃省");
                break;
            case "西宁":
                System.out.println("青海省");
                break;
            case "西安":
                System.out.println("陕西省");
                break;
            case "银川":
                System.out.println("宁夏回族自治区");
                break;
            case "郑州":
                System.out.println("河南省");
                break;
            case "济南":
                System.out.println("山东省");
                break;
            case "太原":
                System.out.println("山西省");
                break;
            case "合肥":
                System.out.println("安徽省");
                break;
            case "南京":
                System.out.println("江苏省");
                break;
            case "成都":
                System.out.println("四川省");
                break;
            case "贵阳":
                System.out.println("贵州省");
                break;
            case "昆明":
                System.out.println("云南省");
                break;
            case "南宁":
                System.out.println("广西壮族自治区");
                break;
            case "拉萨":
                System.out.println("西藏自治区");
                break;
            case "杭州":
                System.out.println("浙江省");
                break;
            case "南昌":
                System.out.println("江西省");
                break;
            case "广州":
                System.out.println("广东省");
                break;
            case "福州":
                System.out.println("福建省");
                break;
            case "台北":
                System.out.println("台湾省");
                break;
            case "海口":
                System.out.println("海南省");
                break;
            case "香港":
                System.out.println("香港特别行政区");
                break;
            case "澳门":
                System.out.println("澳门特别行政区");
                break;
            default:
                System.out.println("不知道");
                break;
        }
    }
}
