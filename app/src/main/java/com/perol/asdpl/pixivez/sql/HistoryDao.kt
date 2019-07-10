package com.perol.asdpl.pixivez.sql

import androidx.room.*
import io.reactivex.Flowable

/*@Dao
abstract class DownIllustsDao {
    @Query("SELECT * FROM downillusts WHERE userid=(:userid)")
    abstract fun getDownUser(userid: Long): Flowable<List<DownIllustsEntity>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(query: DownIllustsEntity)
    @Query("DELETE FROM downillusts WHERE userid=(:userid)")
    abstract fun deleteDownIllust(userid:Long)
}
@Dao
abstract class  DownUserDao {
    @Query("SELECT * FROM downuser")
    abstract fun getDownUser(): Flowable<List<DownUserEntity>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(query: DownUserEntity)
    @Query("DELETE FROM downuser WHERE userid=(:userid)")
    abstract fun deleteDownUser(userid:Long)
}*/
@Dao
abstract class SearchHistoryDao {


    @Query("SELECT * FROM history")
    abstract fun getSearchHistory(): Flowable<List<SearchHistoryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(query: SearchHistoryEntity)

    @Query("DELETE FROM history")
    abstract fun deletehistory()

}

@Dao
abstract class IllustHistoryDao {
    @Query("SELECT * FROM illusthistory")
    abstract fun getIllustHistory(): Flowable<List<IllustBeanEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(query: IllustBeanEntity)

    @Query("DELETE FROM illusthistory")
    abstract fun deletehistory()

    @Query("SELECT * FROM illusthistory WHERE illustid=:illustid")
    abstract fun getHistoryOne(illustid: Long): List<IllustBeanEntity>

    @Delete()
    abstract fun deleteOne(query: IllustBeanEntity)
}

@Dao
abstract class UserDao {
    @Query("SELECT * FROM user")
    abstract fun getIllustHistory(): Flowable<List<UserEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(query: UserEntity)

    @Query("DELETE FROM user")
    abstract fun deletehistory()
}
