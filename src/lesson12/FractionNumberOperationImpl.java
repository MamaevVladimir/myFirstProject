package lesson12;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisl = (a.getDividend() * b.getDivisor()) + (b.getDividend() * a.getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);

        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisl = (a.getDividend() * b.getDivisor()) - (b.getDividend() * a.getDivisor());
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);
        return result;

    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultChisl = (a.getDividend() * b.getDividend()) / (b.getDivisor() * a.getDivisor());
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(resultChisl);
        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
