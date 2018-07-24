namespace java com.lanxiang.springboot.thriftproxy.aftergen.thrift


struct TGetCinemaIdResponse {
  1:  bool success,
  2:  string message,
  3:  i32 cinemaId
}

struct TGetShopIdResponse {
  1:  bool success,
  2:  string message,
  3:  i32 shopId
}

struct TGetShopUUID2CinemaIdResponse {
  1:  bool success,
  2:  string message,
  3:  map<string, i32> shopUUID2CinemaId
}

struct TGetShopUUID2ShopIdResponse {
  1:  bool success,
  2:  string message,
  3:  map<string, i32> shopUUID2ShopId
}


service CinemaRelationRemoteService {
	
  TGetCinemaIdResponse getCinemaIdByShopUUID(1: string arg0),		        	
	
  TGetShopIdResponse getShopIdByShopUUID(1: string arg0),		        	
	
  TGetShopUUID2CinemaIdResponse getShopUUID2CinemaIdMapping(1: set<string> arg0),		        	
	
  TGetShopUUID2ShopIdResponse getShopUUID2ShopIdMapping(1: set<string> arg0)		        	
}
