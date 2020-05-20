package Homework2;

public class VendingMachine {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.findItem(200);

        machine.findItem(100);
        machine.findItemsUsingSwitch(105);
        machine.findItemsUsingSwitch(100);
        machine.findItemsUsingSwitch(105);
    }

    public void findItemsUsingSwitch(int code) {
        switch (code) {
            case 100:
                System.out.println("Here is your Trolli Eggs");
                break;
            case 101:
                System.out.println("Here is your Gummy Bears");
                break;
            case 102:
                System.out.println("Here is your Hot Cheetos");
                break;
            case 211:
                System.out.println("Here is your Skittles");
                break;
            case 220:
                System.out.println("Here is your Gummy Worms");
                break;
            case 221:
                System.out.println("Here is your Snickers");
                break;
            case 300:
                System.out.println("Here is your Twix");
                break;
            case 330:
                System.out.println("Here is your Kit Kat");
                break;
            case 340:
                System.out.println("Here is your Mars Bars");
                break;
            case 401:
                System.out.println("Here is your Water");
                break;
            case 499:
                System.out.println("Here is your Starbursts");
                break;
            case 500:
                System.out.println("Here is your Sour Patch Kids");
                break;
            case 501:
                System.out.println("Here is your Chex Mix");
                break;
            case 600:
                System.out.println("Here is your Sun Chips");
                break;
            default:
                System.out.println("Please provide a valid code");
        }
    }

    public void findItem(int code) {
        if (code >= 100 || code <= 600) {
            if(code == 100) {
                System.out.println("Here is your Trolli Eggs");
            } else if(code == 101) {
                System.out.println("Here is your Gummy Bears");
            } else if(code == 102) {
                System.out.println("Here is your Hot Cheetos");
            } else if(code == 211) {
                System.out.println("Here is your Skittles");
            } else if(code == 220) {
                System.out.println("Here is your Gummy Worms");
            } else if(code == 221) {
                System.out.println("Here is your Snickers");
            } else if(code == 300) {
                System.out.println("Here is your Twix");
            } else if(code == 330) {
                System.out.println("Here is your Kit Kat");
            } else if(code == 340) {
                System.out.println("Here is your Mars Bars");
            } else if(code == 401) {
                System.out.println("Here is your Water");
            } else if(code == 499) {
                System.out.println("Here is your Starbursts");
            } else if(code == 500) {
                System.out.println("Here is your Sour Patch Kids");
            } else if(code == 501) {
                System.out.println("Here is your Chex Mix");
            } else if (code == 600) {
                System.out.println("Here is your Sun Chips");
            }
            else {
                System.out.println("Please provide a valid code");
            }
        }
        else {
            System.out.println("Please provide a valid code");
        }
    }
}
