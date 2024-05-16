import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Moneda {
    @SerializedName("base_code")
    public String base_code;
    @SerializedName("target_code")
    public String target_code;
    @SerializedName("conversion_rate")
    public Double conversion_rate;
    @SerializedName("conversion_result")
    public Double conversion_result;

    public Moneda() {
    }

    public Moneda(String base_code, String target_code, Double conversion_rate, Double conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public Double getConversion_result() {
        return conversion_result;
    }

    @Override
    public String toString() {
        return "Resultado:" +
                "\nValor actual: " + conversion_rate +
                "\nValor convertido:" + conversion_result;
    }
}
