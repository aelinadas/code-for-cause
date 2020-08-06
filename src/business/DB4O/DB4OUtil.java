package business.DB4O;

import business.ConfigureASystem;
import business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    private ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration embeddedConfiguration = Db4oEmbedded.newConfiguration();
            embeddedConfiguration.common().add(new TransparentPersistenceSupport());
            embeddedConfiguration.common().activationDepth(Integer.MAX_VALUE);
            embeddedConfiguration.common().updateDepth(Integer.MAX_VALUE);
            embeddedConfiguration.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);
            ObjectContainer dataBase = Db4oEmbedded.openFile(embeddedConfiguration, FILENAME);
            return dataBase;
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
        return null;
    }

    public synchronized void storeEcoSystem(EcoSystem ecoSystem) {
        ObjectContainer container = createConnection();
        container.store(ecoSystem);
        container.commit();
        container.close();
    }

    public EcoSystem getEcoSystem() {
        ObjectContainer container = createConnection();
        ObjectSet<EcoSystem> result = container.query(EcoSystem.class);
        EcoSystem ecoSystem;
        if (result.size() == 0) {
            ecoSystem = ConfigureASystem.configure();
        } else {
            ecoSystem = result.get(result.size() - 1);
        }
        container.close();
        return ecoSystem;
    }

    protected synchronized static void closeConnection(ObjectContainer container) {
        if (container != null) {
            container.close();
        }
    }
}
