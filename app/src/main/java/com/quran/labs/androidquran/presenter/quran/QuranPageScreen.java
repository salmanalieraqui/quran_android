package com.quran.labs.androidquran.presenter.quran;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import com.quran.labs.androidquran.dao.Bookmark;
import com.quran.page.common.data.AyahCoordinates;
import com.quran.page.common.data.PageCoordinates;

import java.util.List;

public interface QuranPageScreen {
  void setBookmarksOnPage(List<Bookmark> bookmarks);
  void setPageCoordinates(PageCoordinates pageCoordinates);
  void setAyahCoordinatesError();
  void setPageBitmap(int page, @NonNull Bitmap pageBitmap);
  void hidePageDownloadError();
  void setPageDownloadError(@StringRes int errorMessage);
  void setAyahCoordinatesData(AyahCoordinates coordinates);
}
