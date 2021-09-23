package one.microstream.training.mariadb.storage;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;

import one.microstream.afs.sql.types.SqlDataSourceProvider;
import one.microstream.configuration.types.Configuration;

public class DataSourceProvider implements SqlDataSourceProvider
{
	@Override
	public DataSource provideDataSource(Configuration configuration)
	{	
		MariaDbDataSource dataSource = new MariaDbDataSource();
		try
		{
			dataSource.setUrl(configuration.get("url"));
			dataSource.setUser(configuration.get("user"));
			dataSource.setPassword(configuration.get("password"));
			
			return dataSource;
		}
		catch(SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSource;

	}
}
