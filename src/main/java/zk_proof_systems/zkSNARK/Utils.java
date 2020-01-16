package zk_proof_systems.zkSNARK;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author heqiang
 * @date 2020/1/16 10:05
 */
public class Utils {
    public static String sha256(final String data){
        return DigestUtils.shaHex(data);
    }
}
