package tk.alexkomm.everytime.casters;

import android.app.Activity;
import android.view.View;


@SuppressWarnings({"unchecked", "UnusedDeclaration"})
public final class Views {

    private Views() {

    }

    /**
     * Views caster which helps with target type handling
     * Use instead of {@link View#findViewById(int)}
     */
    public static <T extends View> T findById(View view, int id) {
        return (T) view.findViewById(id);
    }

    /**
     * Views caster which helps with target type handling
     * Use instead of {@link Activity#findViewById(int)}
     */
    public static <T extends View> T findById(Activity activity, int id) {
        return (T) activity.findViewById(id);
    }

}