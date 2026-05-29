package practice_5.museum;

public class Museum {
    private ShowPiece showPiece;

    public void addShowPiece(ShowPiece showPiece) {
        this.showPiece = showPiece;
    }

    public void manageShowpiece() {
        showPiece.showInfo();
    }
}
