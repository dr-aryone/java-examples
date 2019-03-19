package in.joshuaaust;

public class LegalVariableNames {

    private String okidentifier,
            $0K2Identifier,
            _also0K1d3ntifi3r,
            __SStillOkbutKnotsonice$;

    public LegalVariableNames() {
        okidentifier = "okidentifier";
        $0K2Identifier = "$0K2Identifier";
        _also0K1d3ntifi3r = "_also0K1d3ntifi3r";
        __SStillOkbutKnotsonice$ = "__SStillOkbutKnotsonice$";
    }

    public String getOkidentifier() {
        return okidentifier;
    }

    public String get$0K2Identifier() {
        return $0K2Identifier;
    }

    public String get_also0K1d3ntifi3r() {
        return _also0K1d3ntifi3r;
    }

    public String get__SStillOkbutKnotsonice$() {
        return __SStillOkbutKnotsonice$;
    }

    public static void printLegalValues() {
        LegalVariableNames legalVariableNames = new LegalVariableNames();
        System.out.println("These are legal variable names:");
        System.out.println(legalVariableNames.getOkidentifier());
        System.out.println(legalVariableNames.get$0K2Identifier());
        System.out.println(legalVariableNames.get_also0K1d3ntifi3r());
        System.out.println(legalVariableNames.get__SStillOkbutKnotsonice$());
    }

}
