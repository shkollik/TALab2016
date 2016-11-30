package transformation;

import cucumber.api.Transformer;

/**
 * Created by Shkolik on 23.11.2016.
 */
public class SalaryCountTransform extends Transformer<Integer>{

    @Override
    public Integer transform(String salary) {
        return salary.length();
    }
}
