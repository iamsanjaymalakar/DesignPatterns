package creational.builder;

public class Client {

	public static void main(String[] args) {

		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from = "client table";
		String where = "client name = ...";

		// build and execute sql query
		QueryBuilder builder = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, builder);
		query.execute();

		builder = new MongoDbQueryBuilder();
		query = director.buildQuery(from, where, builder);
		query.execute();
	}

}
