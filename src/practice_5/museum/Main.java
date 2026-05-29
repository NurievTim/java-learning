package practice_5.museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        ShowPiece sculpture = new Sculpture();
        ShowPiece manuscript = new Manuscript();

        museum.addShowPiece(sculpture);
        museum.manageShowpiece();
    }
}
