package tutorials.hackro.com.gallery.data.repository;

import tutorials.hackro.com.gallery.data.entity.Data;
import tutorials.hackro.com.gallery.data.remote.Mapper;
import tutorials.hackro.com.gallery.domain.model.DataDomain;

/**
 * Created by hackro on 6/03/17.
 */
public class
DatatoDataEntityMaper extends Mapper<DataDomain,Data>{


    @Override
    public Data map(DataDomain value) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public DataDomain reverseMap(Data value) {

        DataDomain dataDomain = new DataDomain();

        dataDomain.setId(value.getId());
        dataDomain.setTitle(value.getTitle());
        dataDomain.setDescription(value.getDescription());
        dataDomain.setDatetime(value.getDatetime());
        dataDomain.setLink(value.getLink());
        return dataDomain;
    }
}
