package org.jenkinsci.plugins.gitclient;

import java.util.Collections;
import java.util.List;

/**
 * CheckoutCommand interface.
 *
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */
public interface CheckoutCommand extends GitCommand {

    /**
     * ref.
     *
     * @param ref a {@link java.lang.String} object.
     * @return a {@link org.jenkinsci.plugins.gitclient.CheckoutCommand} object.
     */
    CheckoutCommand ref(String ref);

    /**
     * branch.
     *
     * @param branch a {@link java.lang.String} object.
     * @return a {@link org.jenkinsci.plugins.gitclient.CheckoutCommand} object.
     */
    CheckoutCommand branch(String branch);

    /**
     * deleteBranchIfExist.
     *
     * @param deleteBranch a boolean.
     * @return a {@link org.jenkinsci.plugins.gitclient.CheckoutCommand} object.
     */
    CheckoutCommand deleteBranchIfExist(boolean deleteBranch);

    /**
     * sparseCheckoutPaths.
     *
     * @param sparseCheckoutPaths a {@link java.util.List} object.
     * @return a {@link org.jenkinsci.plugins.gitclient.CheckoutCommand} object.
     */
    CheckoutCommand sparseCheckoutPaths(List<String> sparseCheckoutPaths);

    /**
     * timeout.
     *
     * @param timeout a {@link java.lang.Integer} object.
     * @return a {@link org.jenkinsci.plugins.gitclient.CheckoutCommand} object.
     */
    CheckoutCommand timeout(Integer timeout);
}
