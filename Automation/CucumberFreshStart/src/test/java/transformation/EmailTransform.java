package transformation;

import cucumber.api.Transformer;

/**
 * Created by Shkolik on 23.11.2016.
 */
public class EmailTransform extends Transformer<String> {

    @Override
    public String transform(String userName) {
        return userName.concat("@ea.com");
    }
}
