public class LearnMainSwitch {
    public static void main(String[] args) {
        byte value; // short, int, char, String, enum
        final byte RANGE = 127;
        value = RANGE;
        switch (value) {
        case 2:
        case 3:
        case 5:
        case 1:
            System.out.println("value is 1");
            break;
        case RANGE:
            System.out.println("value is 127");
            break;
        default:
            System.out.println("value is not 1 or 2");
        }
    }

    public static int defineLevel(String role) {
        int level;
        switch (role) {
        case "guest":
            level = 0;
            break;
        case "client":
            level = 1;
            break;
        case "moderator":
            level = 2;
            break;
        case "admin":
            level = 3;
            break;
        default:
            throw new IllegalArgumentException("Invalid role: " + role);
        }
        return level;
    }

    public int defineLevel2(String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
    }

    public int defineLevel3(String role) {
        var result = switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }
}