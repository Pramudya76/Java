public class Suhu {
    void CelciusToReamur(float Value) {
        float hasil = 4.0f/5.0f * Value;
        System.out.println(Value + "C = " + hasil + "R");
    }

    void CelciusToFahrenheit(float Value) {
        float hasil = 9.0f/5.0f * Value + 32.0f;
        System.out.println(Value + "C = " + hasil + "F");
    }

    void CelciusToKelvin(float Value) {
        float hasil = Value + 273.0f;
        System.out.println(Value + "C = " + hasil + "K");
    }

    void ReamurToCelcius(float Value) {
        float hasil = 5.0f/4.0f * Value;
        System.out.println(Value + "R = " + hasil + "C");
    }

    void ReamurToFahrenheit(float Value) {
        float hasil = 9.0f/4.0f * Value + 32.0f;
        System.out.println(Value + "R = " + hasil + "F");
    }

    void ReamurToKelvin(float Value) {
        float hasil = 5.0f/4.0f * Value + 273.0f;
        System.out.println(Value + "R = " + hasil + "K");
    }

    void FahrenheitToCelcius(float Value) {
        float hasil = 5.0f/9.0f * (Value - 32.0f);
        System.out.println(Value + "F = " + hasil + "C");
    }

    void FahrenheitToReamur(float Value) {
        float hasil = 4.0f/9.0f * (Value - 32.0f);
        System.out.println(Value + "F = " + hasil + "R");
    }

    void FahrenheitToKelvin(float Value) {
        float hasil = 5.0f/9.0f * (Value - 32.0f) + 273.0f;
        System.out.println(Value + "F = " + hasil + "K");
    }

    void KelvinToCelcius(float Value) {
        float hasil = Value - 273.0f;
        System.out.println(Value + "K = " + hasil + "C");
    }

    void KelvinToReamur(float Value) {
        float hasil = 4.0f/5.0f * (Value- 273.0f);
        System.out.println(Value + "K = " + hasil + "R");
    }

    void KelvinToFahrenheit(float Value) {
        float hasil = 9.0f/5.0f * (Value- 273.0f) + 32.0f;
        System.out.println(Value + "K = " + hasil + "F");
    }


}
